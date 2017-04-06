//package huawei;
//
//public class swap {
//    /**
//     * 交换数组里n和0的位置
//     *
//     * @param array
//     *            数组
//     * @param len
//     *            数组长度
//     * @param n
//     *            和0交换的数
//     */
//    // 不要修改以下函数内容
//    public void swapWithZero(int[] array, int len, int n) {
//        Main.swap.SwapWithZero(array, len, n);
//    }
//    // 不要修改以上函数内容
//
//    /**
//     * 通过调用swapWithZero方法来排
//     *
//     * @param array
//     *            存储有[0,n)的数组
//     * @param len
//     *            数组长度
//     */
//    public void sort(int[] array, int len) {
//        // 完成这个函数
//        for(int i = len-1;i>=0; i--){
//            swapWithZero(array,len,array[i]);
//            swapWithZero(array,len,i);
//        }
//    }
//}
//    public static String add2(String n1,String n2)
//    {
//        StringBuffer result = new StringBuffer();
//
//        //1、反转字符串
//        n1 = new StringBuffer(n1).reverse().toString();
//        n2 = new StringBuffer(n2).reverse().toString();
//
//        int len1 = n1.length();
//        int len2 = n1.length();
//        int maxLen = len1 > len2 ? len1 : len2;
//        boolean nOverFlow = false; //是否越界
//        int nTakeOver = 0 ; //溢出数量
//
//        //2.把两个字符串补齐，即短字符串的高位用0补齐
//        if(len1 < len2)
//        {
//            for(int i = len1 ; i < len2 ; i++)
//            {
//                n1 += "0";
//            }
//        }
//        else if (len1 > len2)
//        {
//            for(int i = len2 ; i < len1 ; i++)
//            {
//                n2 += "0";
//            }
//        }
//
//        //3.把两个正整数相加，一位一位的加并加上进位
//        for(int i = 0 ; i < maxLen ; i++)
//        {
//            int nSum = Integer.parseInt(n1.charAt(i) +"") + Integer.parseInt(n2.charAt(i) +"");
//
//            if(nSum >= 10)
//            {
//                if(i == (maxLen - 1))
//                {
//                    nOverFlow  = true;
//                }
//                nTakeOver = 1;
//                result.append(nSum - 10);
//            }
//            else
//            {
//                nTakeOver = 0;
//                result.append(nSum);
//            }
//        }
//
//        //如果溢出的话表示位增加了
//        if(nOverFlow)
//        {
//            result.append(nTakeOver);
//        }
//        return result.reverse().toString();
//    }
//
//
