package com.google.firebase.messaging.ktx;

import Y6.b;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import p7.C1857a;
import y7.u0;

@Keep
/* loaded from: classes.dex */
public final class FirebaseMessagingLegacyRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1857a> getComponents() {
        return u0.x(b.j("fire-fcm-ktx", "24.1.2"));
    }
}
