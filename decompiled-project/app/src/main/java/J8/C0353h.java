package J8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.TimeZone;

/* renamed from: J8.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0353h extends G8.z {

    /* renamed from: c, reason: collision with root package name */
    public static final C0350e f5694c = new C0350e();

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0352g f5695a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f5696b;

    public C0353h(AbstractC0352g abstractC0352g) {
        ArrayList arrayList = new ArrayList();
        this.f5696b = arrayList;
        Objects.requireNonNull(abstractC0352g);
        this.f5695a = abstractC0352g;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (I8.i.f5278a >= 9) {
            arrayList.add(new SimpleDateFormat(X.c.i("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override // G8.z
    public final Object b(O8.a aVar) {
        Date b2;
        if (aVar.j0() == 9) {
            aVar.f0();
            return null;
        }
        String h02 = aVar.h0();
        synchronized (this.f5696b) {
            try {
                Iterator it = this.f5696b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            b2 = K8.a.b(h02, new ParsePosition(0));
                            break;
                        } catch (ParseException e2) {
                            StringBuilder n6 = X.c.n("Failed parsing '", h02, "' as Date; at path ");
                            n6.append(aVar.V(true));
                            throw new Db.d(4, n6.toString(), e2);
                        }
                    }
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            b2 = dateFormat.parse(h02);
                            break;
                        } finally {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f5695a.a(b2);
    }

    @Override // G8.z
    public final void c(O8.b bVar, Object obj) {
        String format;
        Date date = (Date) obj;
        if (date == null) {
            bVar.W();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f5696b.get(0);
        synchronized (this.f5696b) {
            format = dateFormat.format(date);
        }
        bVar.e0(format);
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f5696b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
