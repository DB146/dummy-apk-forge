package h3;

import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class I {

    /* renamed from: a, reason: collision with root package name */
    public final UUID f17662a;

    /* renamed from: b, reason: collision with root package name */
    public final q3.p f17663b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f17664c;

    public I(UUID id, q3.p workSpec, Set tags) {
        kotlin.jvm.internal.l.e(id, "id");
        kotlin.jvm.internal.l.e(workSpec, "workSpec");
        kotlin.jvm.internal.l.e(tags, "tags");
        this.f17662a = id;
        this.f17663b = workSpec;
        this.f17664c = tags;
    }
}
