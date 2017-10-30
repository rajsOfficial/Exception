public class ExceptionHandling
{
    public static void main(String args[]) {
	int value = get(10);
	System.out.println(value);
    }

    public static int get(int location) {
	int[] tempArr = new int[5];
	int result = 0;
	try {
		result = tempArr[location];
	} catch(ArrayIndexOutOfBoundsException exception) {
		exception.printStackTrace();//prints stack trace
		System.out.println("NO such element so setting zero");
		result=0;
	}
	return result;
    }
}