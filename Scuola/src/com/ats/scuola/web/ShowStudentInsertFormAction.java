package com.ats.scuola.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowStudentInsertFormAction implements Command {

	@Override
	public String execute(HttpServletRequest request,
			HttpServletResponse response) {
		return "saveStudentForm.jsp";
	}

}
