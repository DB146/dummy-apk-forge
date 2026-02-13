package h3;

import android.app.Notification;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f17703a;

    /* renamed from: b, reason: collision with root package name */
    public final int f17704b;

    /* renamed from: c, reason: collision with root package name */
    public final Notification f17705c;

    public p(int i7, Notification notification, int i10) {
        this.f17703a = i7;
        this.f17705c = notification;
        this.f17704b = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f17703a == pVar.f17703a && this.f17704b == pVar.f17704b) {
            return this.f17705c.equals(pVar.f17705c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f17705c.hashCode() + (((this.f17703a * 31) + this.f17704b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f17703a + ", mForegroundServiceType=" + this.f17704b + ", mNotification=" + this.f17705c + '}';
    }
}
