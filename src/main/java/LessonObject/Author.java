package LessonObject;

/**
 * Created by student on 19.03.2018.
 */
public class Author implements Cloneable{

    private String name;

    public void setName(String name){ this.name = name;}
    public String getName(){return name;}

    public Author(String name){
        this.name = name;
    }

    public String toString(){
        return "Author: "+name;
    }

    public boolean equals(Object obj){

        if (obj instanceof Author){

            Author otherAuthor = (Author)obj;
            return this.name == otherAuthor.getName();
        }
        else{
            System.out.println("Error: "+obj.toString() + " and "+this.toString()+ " is not comparable");
            return false;
        }
    }

    public Author clone() throws CloneNotSupportedException
    {

        Author returnAuthor = (Author)super.clone();
        returnAuthor.setName(returnAuthor.getName()+" cloned");

        return returnAuthor;
    }


    public int hashCode(){

        return 1;
    }

}
