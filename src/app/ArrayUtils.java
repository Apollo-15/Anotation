package app;

public class ArrayUtils  {
    @MethodInfo(methodName = "plusNumbers", returnType = "int",
            description = "This method will plus 2 numbers")
    @Author(firstName = "Jimmy", lastName = "Page")
    public int plusNumbers(){
        return 2+2;
    }

    @MethodInfo(methodName = "minusNumbers", returnType = "int",
            description = "This method will minus 2 numbers")
    @Author(firstName = "Robert", lastName = "Plant")
    public int minusNumbers(){
        return 2-1;
    }
}