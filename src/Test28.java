/**
 * Author: rogers
 * Date: 2018-07-31
 * Time: Afternoon
 * Declaration: opensource！！！
 */
public class Test28 {
    /**
     * 题目：输入一个字符串，打印出该字符事中字符的所有排列。例如输入字符串abc。
     * 则打印出由字符a、b、c 所能排列出来的所有字符串abc、acb、bac、bca、cab和cba。
	 * 备注：该版本可以支持含有相同字符的字符串，比如：aabb
     */
	public static int cha[];
	
    /**
     * 求字符数组的排列
     *
     * @param res 结果字符串
     * @param begin 当前处理的位置
	 * @param total 待排序字符串的总长度
     */
    public static void permutation(char[] res, int begin, int total) {
        if (total == begin) {
            System.out.print(new String(res) + " ");
        } else {
            for (int i = 0; i < cha.length; i ++) {
                if(cha[i] > 0){
                    cha[i] --;
                    res[begin] = (char)('a' + i);
                    permutation(res, begin + 1, total);
                    cha[i] ++;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[] c1 = {'a', 'b', 'c'};
        char res[] = new char[c1.length];
        int i;
        cha = new int[26];
        //统计数组中每个字符的个数
		for(i = 0; i < c1.length; i ++){
            cha[c1[i] - 'a'] ++;
        }
        permutation(res, 0, c1.length);
        System.out.println();

        char[] c2 = {'a', 'a', 'b', 'b'};
        res = new char[c2.length];
        cha = new int[26];
		//统计数组中每个字符的个数
        for(i = 0; i < c2.length; i ++){
            cha[c2[i] - 'a'] ++;
        }
        permutation(res, 0, c2.length);
        System.out.println();
    }
}
