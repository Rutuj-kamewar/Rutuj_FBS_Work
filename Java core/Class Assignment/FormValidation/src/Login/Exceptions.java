package Login;


class InvalidUsernameException extends Exception {
	public String toString() {
		return "Invalid UserName";
	}
}

class InvalidPasswordException extends Exception {
	public String toString() {
		return "Invalid Password";
	}
}

