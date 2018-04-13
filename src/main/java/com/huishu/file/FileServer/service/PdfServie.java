package com.huishu.file.FileServer.service;

import com.huishu.file.FileServer.entity.FilePdf;

public interface PdfServie {
	/**
	 * 存储pdf
	 * @param url
	 * @return
	 */
	FilePdf savePdf(String url);
	/**
	 * 存储pdf的文件
	 * @param url
	 * @param pdfId
	 * @param sort
	 * @return
	 */
	Boolean savePdfImg(String url,Long pdfId,Integer sort);
}
