DECLARE
 v_deptno dept.deptno%TYPE ;
 v_dname dept.dname%TYPE  ;
 v_loc dept.loc%TYPE ;
 v_ename emp.ename%TYPE;
 CURSOR c_dept IS  select deptno, dname, loc from dept;
 CURSOR emps IS select ename from emp where deptno=v_deptno;
begin
    dbms_output.put_line('in begin of deptlist'); 
	OPEN c_dept; 
	
	
	LOOP 
		FETCH c_dept INTO v_deptno, v_dname,v_loc;
		EXIT WHEN c_dept%notfound; 
		dbms_output.put_line('Data = '  || v_deptno || ', ' ||v_dname || ', ' || v_loc); 
		open emps; 
			LOOP
				FETCH emps INTO v_ename;
				EXIT WHEN emps%notfound;
				dbms_output.put_line(v_ename);
			END LOOP; 
		close emps;

		
	END LOOP; 
END;
/
