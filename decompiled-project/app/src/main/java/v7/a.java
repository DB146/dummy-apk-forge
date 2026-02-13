package v7;

import java.io.File;
import y7.C2410B;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final C2410B f25096a;

    /* renamed from: b, reason: collision with root package name */
    public final String f25097b;

    /* renamed from: c, reason: collision with root package name */
    public final File f25098c;

    public a(C2410B c2410b, String str, File file) {
        this.f25096a = c2410b;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f25097b = str;
        this.f25098c = file;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f25096a.equals(aVar.f25096a) && this.f25097b.equals(aVar.f25097b) && this.f25098c.equals(aVar.f25098c);
    }

    public final int hashCode() {
        return ((((this.f25096a.hashCode() ^ 1000003) * 1000003) ^ this.f25097b.hashCode()) * 1000003) ^ this.f25098c.hashCode();
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f25096a + ", sessionId=" + this.f25097b + ", reportFile=" + this.f25098c + "}";
    }
}
