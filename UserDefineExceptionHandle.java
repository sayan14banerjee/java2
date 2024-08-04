class custonException extends Exception{
    public custonException(String msg){
        super(msg);
    }
}

class UserDefineExceptionHandle {
    public static void ageCheck(int age) throws custonException{
        if (age < 18){
            throw new custonException("You are not aligible");
        }
        else{
            System.out.println("You are eligible");
        }
    }

    public static void main (String args[]){
        try{
            ageCheck(17);
        }catch(custonException e){
            System.out.println("massege: "+ e);
        }
        finally{
            System.out.println("Code run successfully.");
        }
    }
}