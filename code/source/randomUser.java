

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.util.*;
// --- <<IS-END-IMPORTS>> ---

public final class randomUser

{
	// ---( internal utility methods )---

	final static randomUser _instance = new randomUser();

	static randomUser _newInstance() { return new randomUser(); }

	static randomUser _cast(Object o) { return (randomUser)o; }

	// ---( server methods )---




	public static final void getRandomUser (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(getRandomUser)>> ---
		// @sigtype java 3.5
		// [i] field:1:required users
		// [o] field:0:required randomUser
		// pipeline 
		IDataCursor pipelineCursor = pipeline.getCursor(); 
		String	users[] = IDataUtil.getStringArray( pipelineCursor, "users" ); 
		pipelineCursor.destroy(); 
		
		Random random = new Random();
		String randomUser = users[random.nextInt(users.length)];
		// pipeline 
		IDataCursor pipelineCursor_1 = pipeline.getCursor(); 
		IDataUtil.put( pipelineCursor_1, "randomUser", randomUser ); 
		pipelineCursor_1.destroy(); 
			
		// --- <<IS-END>> ---

                
	}
}

