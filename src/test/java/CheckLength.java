public class CheckLength {
    public void checkLength(String str) throws BusinessException{

        if(str.length()<=5)
        {
            System.out.println("长度OK");
        }else
        {
            //抛出自定义异常信息
            throw new BusinessException("长度过长");
        }

    }
}