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
        char res[] = new char[c1.length];
        int i;
        cha = new int[26];
        //ͳ��������ÿ���ַ��ĸ���
		for(i = 0; i < c1.length; i ++){
            cha[c1[i] - 'a'] ++;
        }
        permutation(res, 0, c1.length);
        System.out.println();

        char[] c2 = {'a', 'a', 'b', 'b'};
        res = new char[c2.length];
        cha = new int[26];
		//ͳ��������ÿ���ַ��ĸ���
        for(i = 0; i < c2.length; i ++){
            cha[c2[i] - 'a'] ++;
        }
        permutation(res, 0, c2.length);
        System.out.println();
    }
}
