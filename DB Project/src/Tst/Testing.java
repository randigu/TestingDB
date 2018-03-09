package Tst;

import java.sql.*;
import java.util.*;
import java.util.Date;

public class Testing {
	
	private static int øktID;
	private Date dato;
	private int tidspunkt;
	private int varighet;
	
	public Testing (Date dato, int tidspunkt, int varighet) {
		this.dato = dato;
		this.tidspunkt = tidspunkt;
		this.varighet = varighet;
	}
	
	public int getØktID() {
		return øktID;
	}
}
