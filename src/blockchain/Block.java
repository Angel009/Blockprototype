
package blockchain;

import java.util.Date;

public class Block {
	public String Hash;
	public String previousHash;
	private String data;
	private long timeStamp;
	
	public Block(String data, String previousHash) {
		this.data=data;
		this.previousHash=previousHash;
		this.timeStamp=new Date().getTime();
		this.Hash = calculateHash();
	}
	
	public String calculateHash() {
		String calculatedhash = StringUtil.applySha256( 
				previousHash +
				Long.toString(timeStamp) +
				data 
				);
		return calculatedhash;
	}
	
	
	
}
