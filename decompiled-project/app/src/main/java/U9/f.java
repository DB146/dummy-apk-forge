package U9;

import I2.AbstractC0315d;

/* loaded from: classes2.dex */
public final class f extends AbstractC0315d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9860a;

    @Override // I2.AbstractC0315d
    public final void b(T2.c statement, Object obj) {
        switch (this.f9860a) {
            case 0:
                M9.d entity = (M9.d) obj;
                kotlin.jvm.internal.l.e(statement, "statement");
                kotlin.jvm.internal.l.e(entity, "entity");
                statement.y(1, entity.f6851b);
                return;
            default:
                W9.j entity2 = (W9.j) obj;
                kotlin.jvm.internal.l.e(statement, "statement");
                kotlin.jvm.internal.l.e(entity2, "entity");
                statement.y(1, entity2.f10894a);
                statement.y(2, entity2.f10895b);
                return;
        }
    }

    @Override // I2.AbstractC0315d
    public final String c() {
        switch (this.f9860a) {
            case 0:
                return "DELETE FROM `ExtensionsConfig` WHERE `sourceUrl` = ?";
            default:
                return "DELETE FROM `VideoFavoriteDTO` WHERE `id` = ? AND `url` = ?";
        }
    }
}
