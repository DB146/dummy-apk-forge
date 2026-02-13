package M8;

import G8.A;
import G8.m;
import G8.z;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* loaded from: classes.dex */
public final class b extends z {

    /* renamed from: b, reason: collision with root package name */
    public static final a f6834b = new a();

    /* renamed from: a, reason: collision with root package name */
    public final SimpleDateFormat f6835a;

    /* loaded from: classes.dex */
    public class a implements A {
        @Override // G8.A
        public final z a(m mVar, N8.a aVar) {
            if (aVar.f7386a == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    private b() {
        this.f6835a = new SimpleDateFormat("hh:mm:ss a");
    }

    public /* synthetic */ b(int i7) {
        this();
    }

    @Override // G8.z
    public final Object b(O8.a aVar) {
        Time time;
        if (aVar.j0() == 9) {
            aVar.f0();
            return null;
        }
        String h02 = aVar.h0();
        synchronized (this) {
            TimeZone timeZone = this.f6835a.getTimeZone();
            try {
                try {
                    time = new Time(this.f6835a.parse(h02).getTime());
                } catch (ParseException e2) {
                    throw new Db.d(4, "Failed parsing '" + h02 + "' as SQL Time; at path " + aVar.V(true), e2);
                }
            } finally {
                this.f6835a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        String format;
        Time time = (Time) obj;
        if (time == null) {
            bVar.W();
            return;
        }
        synchronized (this) {
            format = this.f6835a.format((Date) time);
        }
        bVar.e0(format);
    }
}
