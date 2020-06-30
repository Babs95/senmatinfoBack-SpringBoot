package com.babs.senmatinfo.senmatinfo.payload.response;
import java.util.List;
import com.babs.senmatinfo.senmatinfo.models.Role;

public class JwtResponse {
	private String token;
	private String type = "Bearer";
	private Long id;
	private String username;
	private String email;
	//private Profil profil;
	private List<Role> roles;

	/**
	 * Here on a modifier le type de la liste de roles par l'objet role au lieu
	 * d'une liste de type string pour des règles de codage
	 */

	public JwtResponse(String accessToken, Long id, String username, String email, /*Profil profil,*/ List<Role> roles) {
		this.token = accessToken;
		this.id = id;
		this.username = username;
		this.email = email;
		//this.profil = profil;
		this.roles = roles;
	}

	public String getAccessToken() {
		return token;
	}

	public void setAccessToken(String accessToken) {
		this.token = accessToken;
	}

	public String getTokenType() {
		return type;
	}

	public void setTokenType(String tokenType) {
		this.type = tokenType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	/*public Profil getProfil() {
        return profil;
    }

    public void setProfil(Profil profil) {
        this.profil = profil;
    }*/

	public void setUsername(String username) {
		this.username = username;
	}

	public List<Role> getRoles() {
		return roles;
	}
}
