package A8;

import java.util.Locale;
import java.util.UUID;

/* loaded from: classes.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f607a;

    /* renamed from: b, reason: collision with root package name */
    public final l0 f608b;

    /* renamed from: c, reason: collision with root package name */
    public final String f609c;

    /* renamed from: d, reason: collision with root package name */
    public int f610d;

    /* renamed from: e, reason: collision with root package name */
    public P f611e;

    public Y(k0 timeProvider, l0 uuidGenerator) {
        kotlin.jvm.internal.l.e(timeProvider, "timeProvider");
        kotlin.jvm.internal.l.e(uuidGenerator, "uuidGenerator");
        this.f607a = timeProvider;
        this.f608b = uuidGenerator;
        this.f609c = a();
        this.f610d = -1;
    }

    public final String a() {
        this.f608b.getClass();
        UUID randomUUID = UUID.randomUUID();
        kotlin.jvm.internal.l.d(randomUUID, "randomUUID()");
        String uuid = randomUUID.toString();
        kotlin.jvm.internal.l.d(uuid, "uuidGenerator.next().toString()");
        String lowerCase = ac.n.W(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.l.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
