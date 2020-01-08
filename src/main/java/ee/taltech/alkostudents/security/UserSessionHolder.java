package ee.taltech.alkostudents.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * to access logged in user
 */
public class UserSessionHolder {

    public static MyUser getLoggedInUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication == null) return null;
        Object principal = authentication.getPrincipal();
        if (principal == null) return null;
        return principal instanceof MyUser ? (MyUser) principal : null;
    }
}
