/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.PharmaRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aakashrajawat
 */
public class PharmaOrganization extends Organization{

    public PharmaOrganization() {
        super(Type.Pharma.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmaRole());
        return roles;
    }
    
}
