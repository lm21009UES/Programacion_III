/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Administrador
 */
@Entity
@Table(name = "tbl_producto", catalog = "db_tienda", schema = "public")
@NamedQueries({
    @NamedQuery(name = "TblProducto.findAll", query = "SELECT t FROM TblProducto t")})
public class TblProducto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idproducto", nullable = false)
    private Integer idproducto;
    @Column(name = "nombreproducto", length = 100)
    private String nombreproducto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio", precision = 10, scale = 2)
    private BigDecimal precio;
    @JoinColumn(name = "idproveedor", referencedColumnName = "idproveedor")
    @ManyToOne(fetch = FetchType.LAZY)
    private TblProveedor idproveedor;

    public TblProducto() {
    }

    public TblProducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public Integer getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(Integer idproducto) {
        this.idproducto = idproducto;
    }

    public String getNombreproducto() {
        return nombreproducto;
    }

    public void setNombreproducto(String nombreproducto) {
        this.nombreproducto = nombreproducto;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public TblProveedor getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(TblProveedor idproveedor) {
        this.idproveedor = idproveedor;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idproducto != null ? idproducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TblProducto)) {
            return false;
        }
        TblProducto other = (TblProducto) object;
        if ((this.idproducto == null && other.idproducto != null) || (this.idproducto != null && !this.idproducto.equals(other.idproducto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "modelos.TblProducto[ idproducto=" + idproducto + " ]";
    }
    
}
