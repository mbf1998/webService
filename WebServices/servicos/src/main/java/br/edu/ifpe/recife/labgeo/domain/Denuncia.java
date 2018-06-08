package br.edu.ifpe.recife.labgeo.domain;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the denuncias_feature database table.
 * 
 */
@Entity
@Table(name="denuncia")
@NamedQuery(name="Denuncia.findAll", query="SELECT d FROM Denuncia d")
public class Denuncia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="gdb_archive_oid")
	private Integer gdbArchiveOid;
	@Column(name="arquivo")
	private String arquivo;

	private String cep;

	private String cidade;

	private String descricao;

	private String email;

	private String endereco;

	private BigDecimal latitude;

	private BigDecimal longitude;

	private String nome;

	private final Integer objectid = 0;

	@Column(name="ponto_referencia")
	private String pontoReferencia;

	private Integer status = 1;

	@Column(name="telefone_celular")
	private String telefoneCelular;

	@Column(name="telefone_fixo")
	private String telefoneFixo;

	private String titulo;

	//bi-directional many-to-one association to DenunciaHistorico
	@OneToMany(mappedBy="denuncia")
	private List<DenunciaHistorico> denunciaHistoricos;

	public Denuncia() {
	}

	public Integer getGdbArchiveOid() {
		return this.gdbArchiveOid;
	}

	public void setGdbArchiveOid(Integer gdbArchiveOid) {
		this.gdbArchiveOid = gdbArchiveOid;
	}

	public String getArquivo() {
		return this.arquivo;
	}

	public void setArquivo(String arquivo) {
		this.arquivo = arquivo;
	}

	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return this.cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public BigDecimal getLatitude() {
		return this.latitude;
	}

	public void setLatitude(BigDecimal latitude) {
		this.latitude = latitude;
	}

	public BigDecimal getLongitude() {
		return this.longitude;
	}

	public void setLongitude(BigDecimal longitude) {
		this.longitude = longitude;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getObjectid() {
		return this.objectid;
	}

	public String getPontoReferencia() {
		return this.pontoReferencia;
	}

	public void setPontoReferencia(String pontoReferencia) {
		this.pontoReferencia = pontoReferencia;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getTelefoneCelular() {
		return this.telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getTelefoneFixo() {
		return this.telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<DenunciaHistorico> getDenunciaHistoricos() {
		return this.denunciaHistoricos;
	}

	public void setDenunciaHistoricos(List<DenunciaHistorico> denunciaHistoricos) {
		this.denunciaHistoricos = denunciaHistoricos;
	}

	public DenunciaHistorico addDenunciaHistorico(DenunciaHistorico denunciaHistorico) {
		getDenunciaHistoricos().add(denunciaHistorico);
		denunciaHistorico.setDenuncia(this);

		return denunciaHistorico;
	}

	public DenunciaHistorico removeDenunciaHistorico(DenunciaHistorico denunciaHistorico) {
		getDenunciaHistoricos().remove(denunciaHistorico);
		denunciaHistorico.setDenuncia(null);

		return denunciaHistorico;
	}

}