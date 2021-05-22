package Assignment3;

final class Final {
    // final access modifier for class will not allow it to be inherited by other class;
    
    // it will throw error if we try to extends the Final class

    final int daysInWeek = 7;

    public void changeFinal()  {
        // daysInWeek = 3;
       
        // give error because final variable cannot be reassigned
    }

    final void cannotBeOverridden(){
        // this final method cannot be overridden 
        // if we do that, it will throw error
    }
}
