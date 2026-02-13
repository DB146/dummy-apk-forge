package U9;

import I2.AbstractC0315d;

/* loaded from: classes2.dex */
public final class g extends AbstractC0315d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f9861a;

    public g(h hVar) {
        this.f9861a = hVar;
    }

    @Override // I2.AbstractC0315d
    public final void b(T2.c statement, Object obj) {
        String str;
        M9.d entity = (M9.d) obj;
        kotlin.jvm.internal.l.e(statement, "statement");
        kotlin.jvm.internal.l.e(entity, "entity");
        statement.y(1, entity.f6850a);
        String str2 = entity.f6851b;
        statement.y(2, str2);
        T9.a aVar = this.f9861a.f9864c;
        M9.c type = entity.f6852c;
        aVar.getClass();
        kotlin.jvm.internal.l.e(type, "type");
        try {
            str = type.name();
        } catch (Exception unused) {
            str = "TV_CHANNEL";
        }
        statement.y(3, str);
        statement.y(4, str2);
    }

    @Override // I2.AbstractC0315d
    public final String c() {
        return "UPDATE OR ABORT `ExtensionsConfig` SET `sourceName` = ?,`sourceUrl` = ?,`type` = ? WHERE `sourceUrl` = ?";
    }
}
