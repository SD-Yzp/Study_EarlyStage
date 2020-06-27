package cn.sd.yz.facade;

/**
 * 办理任务的门面对象
 * @author Yin
 *
 */
public class RegisterFacade {
	public void register() {
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
