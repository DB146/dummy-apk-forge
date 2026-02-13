package okhttp3;

import Eb.o;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.l;
import okhttp3.internal.tls.CertificateChainCleaner;

/* loaded from: classes2.dex */
public final class CertificatePinner {

    /* renamed from: c, reason: collision with root package name */
    public static final Companion f22261c = new Companion(0);

    /* renamed from: d, reason: collision with root package name */
    public static final CertificatePinner f22262d = new CertificatePinner(o.w0(new Builder().f22265a), null);

    /* renamed from: a, reason: collision with root package name */
    public final Set f22263a;

    /* renamed from: b, reason: collision with root package name */
    public final CertificateChainCleaner f22264b;

    /* loaded from: classes2.dex */
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22265a = new ArrayList();
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(int i7) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class Pin {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Pin)) {
                return false;
            }
            Pin pin = (Pin) obj;
            pin.getClass();
            if (!l.a(null, null)) {
                return false;
            }
            pin.getClass();
            if (!l.a(null, null)) {
                return false;
            }
            pin.getClass();
            return l.a(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    public CertificatePinner(Set set, CertificateChainCleaner certificateChainCleaner) {
        this.f22263a = set;
        this.f22264b = certificateChainCleaner;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CertificatePinner) {
            CertificatePinner certificatePinner = (CertificatePinner) obj;
            if (l.a(certificatePinner.f22263a, this.f22263a) && l.a(certificatePinner.f22264b, this.f22264b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f22263a.hashCode() + 1517) * 41;
        CertificateChainCleaner certificateChainCleaner = this.f22264b;
        return hashCode + (certificateChainCleaner != null ? certificateChainCleaner.hashCode() : 0);
    }
}
