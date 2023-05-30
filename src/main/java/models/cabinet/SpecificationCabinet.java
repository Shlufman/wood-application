package models.cabinet;

import model.codes.CodeCabinet;
import model.codes.ListCodeInnerSpace;

public class SpecificationCabinet {
	public CodeCabinet code;
	public Integer length;
	public ListCodeInnerSpace codes;

	public SpecificationCabinet(CodeCabinet code, Integer length, ListCodeInnerSpace codes) {
		super();
		this.code = code;
		this.length = length;
		this.codes = codes;
	}

	@Override
	public String toString() {
		return "SpecificationCabinet [code=" + code + ", length=" + length + "]";
	}
}
