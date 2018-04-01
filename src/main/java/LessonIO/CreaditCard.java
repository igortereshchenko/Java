package LessonIO;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;

/**
 * Created by student on 28.03.2018.
 */
public class CreaditCard implements Serializable{

    transient private long number;
    private int cvv;
    private int pin;

    private String holder;

    private void writeObject(ObjectOutputStream stream) throws IOException{
//TODO
        cvv=cvv<<3;
        pin=pin<<3;

/*ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);

        buffer.putLong(number);

        byte[] bytes = buffer.array();

        String number="";

        for (int i = 0; i < bytes.length; i++) {
            number+=(char)bytes[i];
        }
        stream.writeUTF(number);*/

        stream.defaultWriteObject();
    }


    private void readObject(ObjectInputStream stream) throws IOException, ClassNotFoundException{

//TODO
       //String number = stream.readUTF();
        stream.defaultReadObject();


        cvv=cvv>>3;
        pin=pin>>3;
/*
        byte[] bytes = number.getBytes();

        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);

        buffer.put(bytes);

        this.number = buffer.getLong();*/

    }

    public CreaditCard(long number, int pin, int cvv, String holder){
        this.number=number;
        this.pin=pin;
        this.cvv=cvv;
        this.holder = holder;

    }
}
