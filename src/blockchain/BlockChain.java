package blockchain;

public class BlockChain {
public static void main(String[] args) {
		
		Block genesisBlock = new Block("Hi im the first block", "0");
		System.out.println("Hash for block 1 : " + genesisBlock.Hash);
		
		Block secondBlock = new Block("Yo im the second block",genesisBlock.Hash);
		System.out.println("Hash for block 2 : " + secondBlock.Hash);
		
		Block thirdBlock = new Block("Hey im the third block",secondBlock.Hash);
		System.out.println("Hash for block 3 : " + thirdBlock.Hash);
	}
}
