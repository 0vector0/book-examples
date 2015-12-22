package horstmann.volume01.chapter7;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class SizedFrame extends JFrame {
  
	public SizedFrame(){
		//определяем размеры окна
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Dimension screenSize = kit.getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;
		
		//установка ширины и высоты фрейма и позиционирование с помощью платформы
		
		setSize(screenWidth/2, screenHeight/2);
		setLocationByPlatform(true);
		
		//установка пиктограмы и заголовка окна
		
		Image img = kit.getImage("1450829689_christmas-icon-gift.png");
		setIconImage(img);
		setTitle("SizedFrame");
		//запрет изменять размеры окна
		//setResizable(false); 
		
		// убрать кнопки  _[]X
		//setUndecorated(true); //
		//!!!ставить до  -- setVisible(true); -- 
		
		//setExtendedState(ICONIFIED); //уже свернуто
		//setExtendedState(MAXIMIZED_BOTH); //на весь экран
		//setExtendedState(MAXIMIZED_VERT); //  ???
		//setExtendedState(MAXIMIZED_HORIZ); // ???
		
		
		
	}
}
