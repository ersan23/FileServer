package com.huishu.QRcode;

import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * 测试二维码
 *
 * @author yindq
 * @date 2017/12/28
 */
public class QRcodeTest {
	/**
	 * 读取二维码
	 * @throws IOException
	 * @throws NotFoundException
	 */
	private static void readZxing() throws IOException, NotFoundException {
		MultiFormatReader read = new MultiFormatReader();
		File file=new File("w:/test.png");
		BufferedImage image= ImageIO.read(file);
		Binarizer binarizer=new HybridBinarizer(new BufferedImageLuminanceSource(image));
		BinaryBitmap binaryBitmap=new BinaryBitmap(binarizer);
		Result res=read.decode(binaryBitmap);
		System.out.println(res.toString());
		System.out.println(res.getBarcodeFormat());
		System.out.println(res.getText());
	}

	public static void main(String[] args) throws IOException, NotFoundException {
		QRcodeTest test =new QRcodeTest();
		test.readZxing();
	}
}
