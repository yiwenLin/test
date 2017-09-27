package huanjushidai;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class test03 {
       
	public class AbstractSender implements Sender{

	   
		public byte[] send(Myobject myobject) {
			// TODO Auto-generated method stub
			byte[] tmp = null;
			try(ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
					ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
					) {
				objectOutputStream.writeObject(myobject);
				tmp = byteArrayOutputStream.toByteArray();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return tmp;
		}
		
	}
	  public class AbstractReceiver implements Receiver{

		@Override
		public Myobject receive(byte[] bytes) {
			// TODO Auto-generated method stub
			Myobject tmp = null;
			try {
				ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(bytes));
				tmp = (Myobject)objectInputStream.readObject();
			}catch(IOException|ClassNotFoundException e) {
				 e.printStackTrace();
			}
			return tmp;
		}
		  
	  }
}
