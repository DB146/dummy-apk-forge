package M8;

import G8.z;
import java.sql.Timestamp;
import java.util.Date;

/* loaded from: classes.dex */
public final class d extends z {

    /* renamed from: b, reason: collision with root package name */
    public static final c f6836b = new c();

    /* renamed from: a, reason: collision with root package name */
    public final z f6837a;

    public d(z zVar) {
        this.f6837a = zVar;
    }

    @Override // G8.z
    public final Object b(O8.a aVar) {
        Date date = (Date) this.f6837a.b(aVar);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        this.f6837a.c(bVar, (Timestamp) obj);
    }
}
