import java.math.BigInteger;
import java.util.List;

/**
 * @author sivan suvari
 * @see Readme.md
 * 
 * 
 */
public class Worker {
	BigInteger one = new BigInteger("1");
	BigInteger zero = new BigInteger("0");
	BigInteger fi, n, p, q, e;
	List<BigInteger> coprimeNumbers;
	BigInteger temp = new BigInteger("0");
	BigInteger kalan;

	BigInteger CalculateD(BigInteger fi, BigInteger e) {
		BigInteger a1, a2, a3, b1, b2, b3, t1, t2, t3, q;

		a1 = one;
		a2 = zero;
		a3 = fi;

		b1 = zero;
		b2 = one;
		b3 = e;

		while (!b3.equals(one)) {
			q = a3.divide(b3);

			t1 = a1.subtract(q.multiply(b1)); // 1 - (3*0)
			t2 = a2.subtract(q.multiply(b2)); // 0 - (3*0)
			t3 = a3.subtract(q.multiply(b3)); // 160 - kalan

			a1 = b1; // 0
			a2 = b2; // 0
			a3 = b3; // 0

			b1 = t1; // 0
			b2 = t2; // 0
			b3 = t3; // 0

			b1 = t1;// 1
			b2 = t2;// -1
			b3 = t3; // 0
		}
		if (b2.signum() < 0) {
			b2 = b2.add(fi);
		}

		return b2;
	}

	private BigInteger Task(BigInteger fi, BigInteger e) {
		if (e.equals(one)) {
			return one;
		}
		kalan = fi.remainder(e);
		temp = Task(e, kalan);
		return kalan;
	}

	void maxE() {
		generateKeys();
		Form.eText.setText(fi.subtract(one).toString());

	}

	void encrypt() {

		BigInteger pow = new BigInteger(Form.srctextarea.getText().trim());
		BigInteger temp = pow;

		while (!((e = e.subtract(one)).equals(zero))) {
			pow = pow.multiply(temp);
		}
		Form.desttextarea.setText(pow.remainder(n).toString());

	}

	public void decrypt() {
		// TODO Auto-generated method stub
		e = new BigInteger(Form.eText.getText());
		Form.srctextarea.setText("");
		Form.srctextarea.setText(new BigInteger(Form.desttextarea.getText())
				.modPow(CalculateD(fi, e), n).toString());

	}

	/**
	 * finds required fi, n, d values for udnerstanding calculation process you
	 * can take a look at rsa vikipedia explanation p and q must be prime number among them
	 * plus e aslo must be a priem number
	 */
	public void generateKeys() {

		p = new BigInteger(Form.ptextarea.getText().trim());
		q = new BigInteger(Form.qtextarea.getText().trim());
		e = new BigInteger(Form.eText.getText().trim());
		n = p.multiply(q);
		fi = p.subtract(one).multiply(q.subtract(one));
		Form.fiText.setText(fi.toString());
		Form.ntextarea.setText(n.toString());
		Form.publictextfield.setText("{" + n.toString() + "," + e + "}");
		Form.privatetextfield.setText("{" + n + "," + CalculateD(fi, e) + "}");
		// TODO Auto-generated method stub

	}
}
