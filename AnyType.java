public class AnyType
{
    private final String TYPE;
    private int integerValue;
    private double doubleValue;
    private char characterValue;
    private String stringValue;

    public AnyType()
    {
        // Default Constructor
        this.TYPE = "None";
    }

    public AnyType(int integerValue)
    {
        this.TYPE = "Integer";
        this.integerValue = integerValue;
    }

    public AnyType(double doubleValue)
    {
        this.TYPE = "Double";
        this.doubleValue = doubleValue;
    }

    public AnyType(char characterValue)
    {
        this.TYPE = "Character";
        this.characterValue = characterValue;
    }

    public AnyType(String stringValue)
    {
        this.TYPE = "String";
        this.stringValue = stringValue;
    }

    public int getInteger()
    {
        if (this.TYPE.equals("Integer"))
        {
            return this.integerValue;
        }
        else
        {
            System.out.println("AnyType Class Object - Method 'getInteger()' is incompatible with " + this.TYPE + " type");
            System.exit(1);
            return 0;
        }
    }

    public double getDouble()
    {
        if (this.TYPE.equals("Double"))
        {
            return this.doubleValue;
        }
        else
        {
            System.out.println("AnyType Class Object - Method 'getDouble()' is incompatible with " + this.TYPE + " type");
            System.exit(1);
            return 0.0;
        }
    }

    public char getCharacter()
    {
        if (this.TYPE.equals("Character"))
        {
            return this.characterValue;
        }
        else
        {
            System.out.println("AnyType Class Object - Method 'getCharacter()' is incompatible with " + this.TYPE + " type");
            System.exit(1);
            return ' ';
        }
    }

    public String getString()
    {
        if (this.TYPE.equals("String"))
        {
            return this.stringValue;
        }
        else
        {
            System.out.println("AnyType Class Object - Method 'getString()' is incompatible with " + this.TYPE + " type");
            System.exit(1);
            return "";
        }
    }

    public String getType()
    {
        return this.TYPE;
    }
}
