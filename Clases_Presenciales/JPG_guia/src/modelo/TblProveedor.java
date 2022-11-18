/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "tbl_proveedor", catalog = "db_tienda", schema = "public")
@NamedQueries({
    @NamedQuery(name = "TblProveedor.findAll", query = "SELECT t FROM TblProveedor t")})
public class TblProveedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproveedor", nullable = false)
    private Integer idproveedor;
    @Column(name = "nombreproveedor", length = 100)
    private String nombreproveedor;
    @OneToMany(mappedBy = "idproveedor")
    private Collection<TblProducto> tblProductoCollection;

    public TblProveedor() {
    }

    public TblProveedor(Integer idproveedor) {
        this.idproveedor = idproveedor;
    }

    public Integer getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(Integer idproveedor) {
        this.idproveedor = idproveedor;
    }

    public String getNombreproveedor() {
        return nombreproveedor;
    }

    public void setNombreproveedor(String nombreproveedor) {
        this.nombreproveedor = nombreproveedor;
    }

    public Collection<TblProducto> getTblProductoCollection() {
        return tblProductoCollection;
    }

    public void setTblProductoCollection(Collection<TblProducto> tblProductoCollection) {
        this.tblProductoCollection = tblProductoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproveedor != null ? idproveedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblProveedor)) {
            return false;
        }
        TblProveedor other = (TblProveedor) object;
        if ((this.idproveedor == null && other.idproveedor != null) || (this.idproveedor != null && !this.idproveedor.equals(other.idproveedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelo.TblProveedor[ idproveedor=" + idproveedor + " ]";
    }
    
}
