package M8;

import G8.A;
import G8.m;
import G8.z;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes.dex */
public class c implements A {
    @Override // G8.A
    public final z a(m mVar, N8.a aVar) {
        if (aVar.f7386a != Timestamp.class) {
            return null;
        }
        mVar.getClass();
        return new d(mVar.d(new N8.a(Date.class)));
    }
}
