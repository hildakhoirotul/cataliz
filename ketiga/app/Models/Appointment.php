<?php

namespace App\Models;

use Illuminate\Database\Eloquent\Model;

class Appointment extends Model
{
    protected $guarded = [];

    public function Doctor()
    {
        return $this->belongsTo(User::class, 'user_id', 'id');
    }
}
