# Part 3 System secutiry
### The New OWASP Top 10 for 2021
My main idea about how to secure the system against this sort of vulnerabilities is:
- A01:2021 – Broken Access Control
	- Configure database to use auth processess and to have well defined Cross Origin control
- A02:2021 – Cryptographic Failures
	- Constantly update encryption tool to keep a good cryptographic control.
	- Use strong salt words and dinamyc keys.
- A03:2021 – Injection
	-Use request analyzers to avoid injection attempts into the system.
- A04:2021 – Insecure Design
	- Constantly perform pentesting to find insecure or critical aspects in the system
	- Review and adapt system to more secure architectural design patterns
- A05:2021 – Security Misconfiguration
	- Avoid default configurations 
	- Hide sensitive details
- A06:2021 – Vulnerable and Outdated Components
	- define enough system roles to avoid undesired access
- A07:2021 – Identification and Authentication Failures
	- Constantly review authentication and indentification performance
	- Add multiple part authentication to improve system security
- A08:2021 – Software and Data Integrity Failures
	-mantain at least 2 backups 
	- allow only soft changes by no-admin users
- A09:2021 – Security Logging and Monitoring Failures
	-using loggin tools in every system component to be informed about everything
- A10:2021 – Server-Side Request Forgery (SSRF)
	- maintain a good enough privacy between components.