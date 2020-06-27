package cn.sd.yz.facade;

/**
 * 不使用门面模式
 * @author Yin
 *
 */
public class Demo01 {
	public static void main(String[] args) {
		工商局 a = new 海淀区工商局();
		a.checkName();
		税务局 b = new 海淀区税务局();
		b.taxCertificate();
		银行 c = new 中国银行();
		c.openAccount();
		质检局 d = new 海淀区质检局();
		d.orgCodeCertificate();
	}
}
