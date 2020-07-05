public class BusinessExceptionTest {



    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CheckLength t = new CheckLength();
        try {
            t.checkLength("123456");
            System.out.println("出错了");
        } catch (BusinessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

}
