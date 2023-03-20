public class CheckStacksNegativeException {

    public static void validate(int[] stacks) throws StacksNegativeException {
        for(int i=0;i<stacks.length;i++){
            if(stacks[i]<0){
                throw new StacksNegativeException();
            }
        }

    }
}
