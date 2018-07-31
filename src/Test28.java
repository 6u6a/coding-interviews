/**
 * Author: rogers
 * Date: 2018-07-31
 * Time: Afternoon
 * Declaration: opensource������
 */
public class Test28 {
    /**
     * ��Ŀ������һ���ַ�������ӡ�����ַ������ַ����������С����������ַ���abc��
     * ���ӡ�����ַ�a��b��c �������г����������ַ���abc��acb��bac��bca��cab��cba��
	 * ��ע���ð汾����֧�ֺ�����ͬ�ַ����ַ��������磺aabb
     */
	public static int cha[];
	
	public static void permutation(char[] chars){
        char res[] = new char[chars.length];
        int i;
        cha = new int[26];
        //ͳ��������ÿ���ַ��ĸ���
		for(i = 0; i < chars.length; i ++){
            cha[chars[i] - 'a'] ++;
        }
        permutation(res, 0, chars.length);
        System.out.println();
	}
	
    /**
     * ���ַ����������
     *
     * @param res ����ַ���
     * @param begin ��ǰ�����λ��
	 * @param total �������ַ������ܳ���
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
		permutation(c1);

        char[] c2 = {'a', 'a', 'b', 'b'};
        permutation(c2);
    }
}
