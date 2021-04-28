package com.breadwallet.presenter.entities;

/**
 * Fastwallet
 * Created by Mohamed Barry on 3/10/20
 * email: mosadialiou@gmail.com
 * Copyright © 2021 Fastcoin Project. All rights reserved.
 */
public class Fee {
    public final long luxury;
    public final long regular;
    public final long economy;
    public final long timestamp;

    public Fee(long luxury, long regular, long economy, long timestamp) {
        this.luxury = luxury;
        this.regular = regular;
        this.economy = economy;
        this.timestamp = timestamp;
    }
}
