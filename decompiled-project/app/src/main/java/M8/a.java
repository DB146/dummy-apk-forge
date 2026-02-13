package M8;

import G8.A;
import G8.m;
import G8.z;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class a extends z {

    /* renamed from: b, reason: collision with root package name */
    public static final C0000a f6832b = new C0000a();

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f6833a;

    /* renamed from: M8.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0000a implements A {
        @Override // G8.A
        public final z a(m mVar, N8.a aVar) {
            if (aVar.f7386a == Date.class) {
                return new a(0);
            }
            return null;
        }
    }

    private a() {
        this.f6833a = new SimpleDateFormat("MMM d, yyyy");
    }

    public /* synthetic */ a(int i7) {
        this();
    }

    @Override // G8.z
    public final Object b(O8.a aVar) {
        Date date;
        if (aVar.j0() == 9) {
            aVar.f0();
            return null;
        }
        String h02 = aVar.h0();
        synchronized (this) {
            TimeZone timeZone = this.f6833a.getTimeZone();
            try {
                try {
                    date = new Date(this.f6833a.parse(h02).getTime());
                } catch (ParseException e2) {
                    throw new Db.d(4, "Failed parsing '" + h02 + "' as SQL Date; at path " + aVar.V(true), e2);
                }
            } finally {
                this.f6833a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.W();
            return;
        }
        synchronized (this) {
            format = this.f6833a.format((java.util.Date) date);
        }
        bVar.e0(format);
    }
}
