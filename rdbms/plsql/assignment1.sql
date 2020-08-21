DECLARE
 v_deptno dept.deptno%TYPE ;
 v_dname dept.dname%TYPE  ;
 v_loc dept.loc%TYPE ;
 v_ename emp.ename%TYPE;
 flag number;
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
		flag:=0;
			LOOP
				
				FETCH emps INTO v_ename;
				IF emps%notfound then
					IF flag=0 then
						dbms_output.put_line('no data found');
					END IF;
					EXIT;
				ELSE	
					dbms_output.put_line(v_ename);
					flag:=1;
				END IF;
			END LOOP; 
		close emps;

		
	END LOOP; 
END;
/
