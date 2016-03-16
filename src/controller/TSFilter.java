package controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Account;
import model.Role;
import model.User;
import util.StringPool;
import util.TSUtil;
import constants.TSConstants;

/**
 * Servlet Filter implementation class TSFilter
 */
@WebFilter(description = "TSFilter", urlPatterns = { "/TSFilter" })
public class TSFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public TSFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	@Override
	public void doFilter(final ServletRequest request,
			final ServletResponse response, final FilterChain chain)
			throws IOException, ServletException {
		final HttpSession session = ((HttpServletRequest) request)
				.getSession(true);

		final HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		final HttpServletResponse httpServletResponse = (HttpServletResponse) response;

		final User currentLoggedInUser = (User) session.getAttribute("user");
		final Account currentLoggedInAccount = (Account) session
				.getAttribute("account");
		final Role currentLoggedInRole = (Role) session.getAttribute("role");

		final String cmd = TSUtil.getParameter(httpServletRequest,
				TSConstants.CMD, StringPool.BLANK);

		if (currentLoggedInAccount == null && !cmd.equals(TSConstants.LOGIN)) {
			this.goToPage(TSConstants.LOGIN_JSP, httpServletRequest,
					httpServletResponse);
			return;
		} else {
			// final Role accountRole = (Role)
			// currentLoggedInAccount.getAccountRoleMapsForAccId().toArray()[0];
			// final Set<RolePermissionMap> rpms =
			// accountRole.getRolePermissionMaps();
			//
			// final List<Permission> permissionList = new
			// ArrayList<Permission>();
			//
			// for(final RolePermissionMap rpm: rpms){
			// permissionList.add(rpm.getPermission());
			// }
			//
			// final Integer roleId = accountRole.getRoleId();
			//
			// if(roleId.equals(RoleConstants.ROLE_ADMIN)){
			//
			// } else if(roleId.equals(RoleConstants.ROLE_LECTURER)){
			// // Cannot access something??
			//
			//
			// } else if(roleId.equals(RoleConstants.ROLE_STUDENT)){
			//
			// }
			final String requestURL = httpServletRequest.getRequestURL()
					.toString();

//			if (!cmd.equals(TSConstants.EDIT_USER)) {
//
//				if(requestURL.contains(TSConstants.TESTING_SYSTEM_SERVLET_URL_PATTERN)){
//					if(r){
//
//					}
//				}
//				this.goToPage(TSConstants.STUDENT_INDEX_JSP, httpServletRequest, httpServletResponse);
//			}
		}

		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	@Override
	public void init(final FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

	public void goToPage(final String page, final HttpServletRequest request,
			final HttpServletResponse response) throws ServletException,
			IOException {
		final RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

}
