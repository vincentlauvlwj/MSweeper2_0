import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 * @author Vincent Lau
 * @filename MineButton.java
 * @description 
 * @date 2014-1-23
 */

@SuppressWarnings("serial")
public class MineButton extends JButton{
	private int row;				//����
	private int col;				//����
	private int flag;				//���״̬��0Ϊ�ޱ�ǣ�1Ϊ���ӣ�2Ϊ�ʺ�
	private boolean isClicked;		//�Ƿ��ѱ��㿪
	
	public MineButton(int row, int col, ImageIcon icon) {
		super(icon);
		this.row = row;
		this.col = col;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public boolean isClicked() {
		return isClicked;
	}

	public void setClicked(boolean isClicked) {
		this.isClicked = isClicked;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}
}
